package com.custom.customGenerator;


import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

@Component
public class CustomIdGenerator implements IdentifierGenerator {
    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object o) throws HibernateException {
        String prefix = "OD" ;
        String suffix = "";
        try {
            Connection con = session.connection();
            PreparedStatement stmt = con.prepareStatement("SELECT MAX(CAST(SUBSTRING(ORDER_ID, 3) AS SIGNED)) + 1 FROM order_details");
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    int nextId = rs.getInt(1);
                    suffix = String.valueOf(nextId);
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prefix+suffix;
    }
}
