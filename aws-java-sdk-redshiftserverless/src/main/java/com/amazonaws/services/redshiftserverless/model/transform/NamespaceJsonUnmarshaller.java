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
package com.amazonaws.services.redshiftserverless.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.redshiftserverless.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Namespace JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NamespaceJsonUnmarshaller implements Unmarshaller<Namespace, JsonUnmarshallerContext> {

    public Namespace unmarshall(JsonUnmarshallerContext context) throws Exception {
        Namespace namespace = new Namespace();

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
                if (context.testExpression("adminUsername", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    namespace.setAdminUsername(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    namespace.setCreationDate(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("dbName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    namespace.setDbName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("defaultIamRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    namespace.setDefaultIamRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("iamRoles", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    namespace.setIamRoles(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("kmsKeyId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    namespace.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("logExports", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    namespace.setLogExports(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("namespaceArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    namespace.setNamespaceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("namespaceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    namespace.setNamespaceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("namespaceName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    namespace.setNamespaceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    namespace.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
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

        return namespace;
    }

    private static NamespaceJsonUnmarshaller instance;

    public static NamespaceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NamespaceJsonUnmarshaller();
        return instance;
    }
}
