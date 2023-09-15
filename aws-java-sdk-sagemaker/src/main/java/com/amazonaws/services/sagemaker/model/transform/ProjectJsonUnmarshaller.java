/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Project JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProjectJsonUnmarshaller implements Unmarshaller<Project, JsonUnmarshallerContext> {

    public Project unmarshall(JsonUnmarshallerContext context) throws Exception {
        Project project = new Project();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ProjectArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    project.setProjectArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProjectName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    project.setProjectName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProjectId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    project.setProjectId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProjectDescription", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    project.setProjectDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceCatalogProvisioningDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    project.setServiceCatalogProvisioningDetails(ServiceCatalogProvisioningDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ServiceCatalogProvisionedProductDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    project.setServiceCatalogProvisionedProductDetails(ServiceCatalogProvisionedProductDetailsJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("ProjectStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    project.setProjectStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    project.setCreatedBy(UserContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    project.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    project.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    project.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    project.setLastModifiedBy(UserContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (token == FIELD_NAME && !knownMember) {
                    context.nextToken();
                    com.amazonaws.transform.UnknownMemberJsonUnmarshaller.getInstance().unmarshall(context);
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return project;
    }

    private static ProjectJsonUnmarshaller instance;

    public static ProjectJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProjectJsonUnmarshaller();
        return instance;
    }
}
