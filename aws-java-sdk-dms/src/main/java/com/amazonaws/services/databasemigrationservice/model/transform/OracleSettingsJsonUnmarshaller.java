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
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * OracleSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OracleSettingsJsonUnmarshaller implements Unmarshaller<OracleSettings, JsonUnmarshallerContext> {

    public OracleSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        OracleSettings oracleSettings = new OracleSettings();

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
                if (context.testExpression("AddSupplementalLogging", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setAddSupplementalLogging(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ArchivedLogDestId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setArchivedLogDestId(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("AdditionalArchivedLogDestId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setAdditionalArchivedLogDestId(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ExtraArchivedLogDestIds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setExtraArchivedLogDestIds(new ListUnmarshaller<Integer>(context.getUnmarshaller(Integer.class))

                    .unmarshall(context));
                }
                if (context.testExpression("AllowSelectNestedTables", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setAllowSelectNestedTables(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ParallelAsmReadThreads", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setParallelAsmReadThreads(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ReadAheadBlocks", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setReadAheadBlocks(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("AccessAlternateDirectly", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setAccessAlternateDirectly(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("UseAlternateFolderForOnline", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setUseAlternateFolderForOnline(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("OraclePathPrefix", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setOraclePathPrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UsePathPrefix", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setUsePathPrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplacePathPrefix", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setReplacePathPrefix(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("EnableHomogenousTablespace", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setEnableHomogenousTablespace(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("DirectPathNoLog", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setDirectPathNoLog(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ArchivedLogsOnly", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setArchivedLogsOnly(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("AsmPassword", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setAsmPassword(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AsmServer", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setAsmServer(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AsmUser", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setAsmUser(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CharLengthSemantics", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setCharLengthSemantics(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DatabaseName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setDatabaseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DirectPathParallelLoad", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setDirectPathParallelLoad(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("FailTasksOnLobTruncation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setFailTasksOnLobTruncation(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("NumberDatatypeScale", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setNumberDatatypeScale(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Password", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setPassword(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Port", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ReadTableSpaceName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setReadTableSpaceName(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RetryInterval", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setRetryInterval(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SecurityDbEncryption", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setSecurityDbEncryption(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecurityDbEncryptionName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setSecurityDbEncryptionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServerName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setServerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SpatialDataOptionToGeoJsonFunctionName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setSpatialDataOptionToGeoJsonFunctionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StandbyDelayTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setStandbyDelayTime(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Username", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setUsername(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UseBFile", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setUseBFile(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("UseDirectPathFullLoad", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setUseDirectPathFullLoad(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("UseLogminerReader", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setUseLogminerReader(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("SecretsManagerAccessRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setSecretsManagerAccessRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecretsManagerSecretId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setSecretsManagerSecretId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecretsManagerOracleAsmAccessRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setSecretsManagerOracleAsmAccessRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecretsManagerOracleAsmSecretId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setSecretsManagerOracleAsmSecretId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TrimSpaceInChar", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setTrimSpaceInChar(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ConvertTimestampWithZoneToUTC", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setConvertTimestampWithZoneToUTC(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("OpenTransactionWindow", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    oracleSettings.setOpenTransactionWindow(context.getUnmarshaller(Integer.class).unmarshall(context));
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

        return oracleSettings;
    }

    private static OracleSettingsJsonUnmarshaller instance;

    public static OracleSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OracleSettingsJsonUnmarshaller();
        return instance;
    }
}
