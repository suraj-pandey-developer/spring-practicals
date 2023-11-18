package com.custom.customGenerator;


import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.sql.Connection;
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
            Statement stmt = con.createStatement();
            String sql = "SELECT order_id_seq.nextval from dual";
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()) {
               int seqrav =  rs.getInt(1);
               suffix = String.valueOf(seqrav);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prefix+suffix;

    }
}
