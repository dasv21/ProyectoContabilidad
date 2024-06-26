package com.msvc.bill.services;

import com.msvc.bill.entities.SaleBill;
import com.msvc.bill.projection.SaleBillProjection;

import java.util.List;

/**
 * @author David Santiago
 */
public interface SaleBillService {

    SaleBill create(SaleBill saleBill);

    SaleBill update(SaleBill saleBill);

    SaleBill findById(Long id);

    List<SaleBillProjection> findAll();

    List<SaleBill> findAllByCompanyId(Long companyId);

    void delete(Long id);
}
