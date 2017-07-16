package com.lazi.coder.dao;

import com.lazi.coder.domain.OfficeFile;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Viet on 16/07/2017.
 */
public interface OfficeRepository extends MongoRepository<OfficeFile, String> {

}
