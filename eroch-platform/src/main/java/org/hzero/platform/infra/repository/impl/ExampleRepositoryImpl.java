package org.hzero.platform.infra.repository.impl;

import org.hzero.platform.domain.entity.Example;
import org.hzero.platform.domain.repository.ExampleRepository;
import org.hzero.mybatis.base.impl.BaseRepositoryImpl;
import org.springframework.stereotype.Repository;

/**
 * Repository Impl
 */
@Repository
public class ExampleRepositoryImpl extends BaseRepositoryImpl<Example> implements ExampleRepository {

}
