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
package com.amazonaws.services.fsx.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.fsx.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * FileCache JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FileCacheJsonUnmarshaller implements Unmarshaller<FileCache, JsonUnmarshallerContext> {

    public FileCache unmarshall(JsonUnmarshallerContext context) throws Exception {
        FileCache fileCache = new FileCache();

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
                if (context.testExpression("OwnerId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fileCache.setOwnerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fileCache.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("FileCacheId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fileCache.setFileCacheId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FileCacheType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fileCache.setFileCacheType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FileCacheTypeVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fileCache.setFileCacheTypeVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Lifecycle", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fileCache.setLifecycle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fileCache.setFailureDetails(FileCacheFailureDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StorageCapacity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fileCache.setStorageCapacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fileCache.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubnetIds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fileCache.setSubnetIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("NetworkInterfaceIds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fileCache.setNetworkInterfaceIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("DNSName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fileCache.setDNSName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fileCache.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceARN", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fileCache.setResourceARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LustreConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fileCache.setLustreConfiguration(FileCacheLustreConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DataRepositoryAssociationIds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fileCache.setDataRepositoryAssociationIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
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

        return fileCache;
    }

    private static FileCacheJsonUnmarshaller instance;

    public static FileCacheJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FileCacheJsonUnmarshaller();
        return instance;
    }
}
