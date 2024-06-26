package com.msvc.bill.services;

import com.msvc.bill.entities.BuyBill;
import com.msvc.bill.projection.BuyBillProjection;

import java.util.List;

/**
 * @author David Santiago
 */
public interface BuyBillService {

    BuyBill create(BuyBill buyBill);

    BuyBill update(BuyBill buyBill);

    BuyBill findById(Long id);

    List<BuyBillProjection> findAll();

    List<BuyBill> findAllByCompanyId(Long companyId);

    void delete(Long id);
}
