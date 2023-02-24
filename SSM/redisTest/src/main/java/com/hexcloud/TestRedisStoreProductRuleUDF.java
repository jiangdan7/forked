package com.hexcloud;

public class TestRedisStoreProductRuleUDF {
    public static void main(String[] args) {
        RedisStoreProductRuleUDF redisStoreProductRuleUDF = new RedisStoreProductRuleUDF();
        String evaluate = redisStoreProductRuleUDF.evaluate("r-uf63mv6y7416dbw6ew.redis.rds.aliyuncs.com", 6379, "store_id_*", "ER23s64f334wdkBNH");
        System.out.println("evaluate = " + evaluate);
    }
}