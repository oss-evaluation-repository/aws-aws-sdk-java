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
package com.amazonaws.services.dataexchange.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.dataexchange.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ImportAssetFromApiGatewayApiResponseDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportAssetFromApiGatewayApiResponseDetailsJsonUnmarshaller implements
        Unmarshaller<ImportAssetFromApiGatewayApiResponseDetails, JsonUnmarshallerContext> {

    public ImportAssetFromApiGatewayApiResponseDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        ImportAssetFromApiGatewayApiResponseDetails importAssetFromApiGatewayApiResponseDetails = new ImportAssetFromApiGatewayApiResponseDetails();

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
                if (context.testExpression("ApiDescription", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importAssetFromApiGatewayApiResponseDetails.setApiDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ApiId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importAssetFromApiGatewayApiResponseDetails.setApiId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ApiKey", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importAssetFromApiGatewayApiResponseDetails.setApiKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ApiName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importAssetFromApiGatewayApiResponseDetails.setApiName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ApiSpecificationMd5Hash", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importAssetFromApiGatewayApiResponseDetails.setApiSpecificationMd5Hash(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ApiSpecificationUploadUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importAssetFromApiGatewayApiResponseDetails.setApiSpecificationUploadUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ApiSpecificationUploadUrlExpiresAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importAssetFromApiGatewayApiResponseDetails.setApiSpecificationUploadUrlExpiresAt(DateJsonUnmarshallerFactory.getInstance("iso8601")
                            .unmarshall(context));
                }
                if (context.testExpression("DataSetId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importAssetFromApiGatewayApiResponseDetails.setDataSetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProtocolType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importAssetFromApiGatewayApiResponseDetails.setProtocolType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RevisionId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importAssetFromApiGatewayApiResponseDetails.setRevisionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Stage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importAssetFromApiGatewayApiResponseDetails.setStage(context.getUnmarshaller(String.class).unmarshall(context));
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

        return importAssetFromApiGatewayApiResponseDetails;
    }

    private static ImportAssetFromApiGatewayApiResponseDetailsJsonUnmarshaller instance;

    public static ImportAssetFromApiGatewayApiResponseDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImportAssetFromApiGatewayApiResponseDetailsJsonUnmarshaller();
        return instance;
    }
}
