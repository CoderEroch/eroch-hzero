package org.hzero.register.infra.repository.impl;

import org.hzero.register.domain.entity.Example;
import org.hzero.register.domain.repository.ExampleRepository;
import org.hzero.mybatis.base.impl.BaseRepositoryImpl;
import org.springframework.stereotype.Repository;

/**
 * Repository Impl
 */
@Repository
public class ExampleRepositoryImpl extends BaseRepositoryImpl<Example> implements ExampleRepository {

}
