package com.hexcloud;

import com.aliyun.odps.udf.UDF;
import com.sun.istack.internal.Nullable;
import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * @BeLongsProject:maxcompute-master
 * @BelongsPackage:cn.hexcloud.udf
 * @Author:jiangdan
 * @createTime:2023-02-15 17:54:35
 * @Description:TODO
 * @Version:1.0
 */
public class RedisStoreProductRuleUDF extends UDF {
    public String evaluate(String host, Integer port, String pattern, @Nullable String auth) {
        Jedis jedis = new Jedis(host, port);
        if (auth != null) {
            jedis.auth(auth);
        }
        Set<String> keys = jedis.keys(pattern);
        jedis.del(keys.toArray(new String[0]));
        return "Redis中的门店商品数据已清理！！！";
    }
}
