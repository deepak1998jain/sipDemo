package com.paytmmoney.sip.sipDemo.repository.mysql;
import com.paytmmoney.sip.sipDemo.model.mysql.SipEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SipRepository extends JpaRepository<SipEntity,Integer>{

}
