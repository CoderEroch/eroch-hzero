package org.hzero.oauth.config;

import org.springframework.beans.factory.annotation.Autowired;
import io.choerodon.core.swagger.ChoerodonRouteData;
import io.choerodon.swagger.annotation.ChoerodonExtraData;
import io.choerodon.swagger.swagger.extra.ExtraData;
import io.choerodon.swagger.swagger.extra.ExtraDataManager;

/**
 * 服务路由配置
 */
@ChoerodonExtraData
public class RouteExtraDataManager implements ExtraDataManager {
	
	@Autowired
    private org.springframework.core.env.Environment environment;

    @Override
    public ExtraData getData() {
        ChoerodonRouteData choerodonRouteData = new ChoerodonRouteData();
        choerodonRouteData.setName(environment.getProperty("hzero.service.current.name", "HOTH"));
        choerodonRouteData.setPath(environment.getProperty("hzero.service.current.path", "/oauth/**"));
        choerodonRouteData.setServiceId(environment.getProperty("hzero.service.current.service-name", "eroch-oauth"));
        extraData.put(ExtraData.ZUUL_ROUTE_DATA, choerodonRouteData);
        return extraData;
    }
}
