package com.nepxion.skeleton.context;

/**
 * <p>Title: Nepxion Skeleton Generator</p>
 * <p>Description: Nepxion Skeleton Generator For Freemarker</p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @email 1394997@qq.com
 * @version 1.0
 */

import org.apache.commons.lang3.StringUtils;

import com.nepxion.skeleton.constant.SkeletonConstants;
import com.nepxion.skeleton.util.SkeletonUtil;

public class SkeletonPath {
    private String projectType;
    private String basePackagePath;

    public SkeletonPath(String projectType, String basePackagePath) {
        this.projectType = projectType;
        this.basePackagePath = basePackagePath;
    }

    public String getProjectType() {
        return projectType;
    }

    public String getBasePackagePath() {
        return basePackagePath;
    }

    public String generateBasePackagePath() {
        if (StringUtils.isNotEmpty(basePackagePath)) {
            return SkeletonConstants.FILE_SEPARATOR + basePackagePath;
        }

        return SkeletonConstants.FILE_SEPARATOR + SkeletonConstants.TEMPLATE;
    }

    public String getJavaBasePackagePath() {
        return SkeletonUtil.formatGeneratePath(generateBasePackagePath()) + projectType + SkeletonConstants.FILE_SEPARATOR + SkeletonConstants.JAVA;
    }

    public String getResourcesBasePackagePath() {
        return SkeletonUtil.formatGeneratePath(generateBasePackagePath()) + projectType + SkeletonConstants.FILE_SEPARATOR + SkeletonConstants.RESOURCES;
    }

    public String getDockerBasePackagePath() {
        return SkeletonUtil.formatGeneratePath(generateBasePackagePath()) + projectType + SkeletonConstants.FILE_SEPARATOR + SkeletonConstants.DOCKER;
    }

    public String getProjectBasePackagePath() {
        return SkeletonUtil.formatGeneratePath(generateBasePackagePath()) + projectType + SkeletonConstants.FILE_SEPARATOR + SkeletonConstants.PROJECT;
    }
}