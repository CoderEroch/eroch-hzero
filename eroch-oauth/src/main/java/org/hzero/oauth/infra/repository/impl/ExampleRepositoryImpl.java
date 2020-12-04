package org.hzero.oauth.infra.repository.impl;

import org.hzero.oauth.domain.entity.Example;
import org.hzero.oauth.domain.repository.ExampleRepository;
import org.hzero.mybatis.base.impl.BaseRepositoryImpl;
import org.springframework.stereotype.Repository;

/**
 * Repository Impl
 */
@Repository
public class ExampleRepositoryImpl extends BaseRepositoryImpl<Example> implements ExampleRepository {

}
