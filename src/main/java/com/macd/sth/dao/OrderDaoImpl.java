package com.macd.sth.dao;

import com.macd.sth.models.inventory;
import com.macd.sth.models.order;
import com.macd.sth.models.tyre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Repository
public class OrderDaoImpl implements OrderDao {


    @Autowired
    InventoryDao inventoryDao;

    @Autowired
    TyreDao tyreDao;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void orderTyre(int overHeadCharges, String paymentMode, String Status, int custID, String modelNo, int quantity) {

        inventory inv = inventoryDao.getStockByModelNo(modelNo);
        int stock = inv.getQuantity();
        System.out.println(stock);
        int net = stock-quantity;
        System.out.println(net);
        tyre ty = tyreDao.getTyreDetails(modelNo);
        int price = ty.getPrice();

        String sql1 = "insert into orders (overHeadCharges, paymentMode, status, custID, modelNo, quantity, amount) " +
                "values (?,?,?,?,?,?,?)";



        String sql2 = "update inventory set quantity="+net+" where modelNo='"+modelNo+"';";
        this.jdbcTemplate.update(sql1, overHeadCharges, paymentMode, Status, custID, modelNo, quantity, price*quantity);

        this.jdbcTemplate.update(sql2);


    }

    @Override
    public order getDetails(String modelNo) {

        String sql = "select * from orders where modelNo='"+modelNo+"';";
        RowMapper<order> rowMapper = new BeanPropertyRowMapper<order>(order.class);
        order order = jdbcTemplate.queryForObject(sql, rowMapper);
        return order;

    }
}
