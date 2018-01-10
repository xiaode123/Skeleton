package com.nepxion.skeleton.plugin.springcloud.generator.client.java;

/**
 * <p>Title: Nepxion Skeleton</p>
 * <p>Description: Nepxion Skeleton For Freemarker</p>
 * <p>Copyright: Copyright (c) 2017-2020</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import java.util.HashMap;
import java.util.Map;

import com.nepxion.skeleton.engine.constant.SkeletonConstant;
import com.nepxion.skeleton.engine.context.SkeletonContext;
import com.nepxion.skeleton.engine.generator.SkeletonJavaGenerator;
import com.nepxion.skeleton.engine.property.SkeletonProperties;

public class ClientRestTestClassGenerator extends SkeletonJavaGenerator {
    public ClientRestTestClassGenerator(SkeletonContext skeletonContext, SkeletonProperties skeletonProperties) {
        super(skeletonContext.clone("client", ClientRestTestClassGenerator.class), skeletonProperties);
    }

    @Override
    protected String getPackage() {
        return super.getPackage() + ".test";
    }

    @Override
    protected String getClassName() {
        return "ClientRestTest";
    }

    @Override
    protected String getTemplateName() {
        return "ClientRestTest.java.template";
    }

    @Override
    protected boolean isMainCode() {
        return true;
    }

    @Override
    protected Object getDataModel() {
        Map<String, Object> dataModel = new HashMap<String, Object>();
        dataModel.put(SkeletonConstant.PACKAGE, getPackage());
        dataModel.put(SkeletonConstant.BASE_PACKAGE, super.getPackage());
        dataModel.put("port", skeletonProperties.getString("clientPort"));

        return dataModel;
    }
}