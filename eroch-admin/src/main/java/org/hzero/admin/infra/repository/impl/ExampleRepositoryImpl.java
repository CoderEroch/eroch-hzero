package org.hzero.admin.infra.repository.impl;

import org.hzero.admin.domain.entity.Example;
import org.hzero.admin.domain.repository.ExampleRepository;
import org.hzero.mybatis.base.impl.BaseRepositoryImpl;
import org.springframework.stereotype.Repository;

/**
 * Repository Impl
 */
@Repository
public class ExampleRepositoryImpl extends BaseRepositoryImpl<Example> implements ExampleRepository {

}
