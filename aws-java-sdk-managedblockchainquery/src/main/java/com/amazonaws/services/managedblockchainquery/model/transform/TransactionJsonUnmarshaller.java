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
package com.amazonaws.services.managedblockchainquery.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.managedblockchainquery.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Transaction JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransactionJsonUnmarshaller implements Unmarshaller<Transaction, JsonUnmarshallerContext> {

    public Transaction unmarshall(JsonUnmarshallerContext context) throws Exception {
        Transaction transaction = new Transaction();

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
                if (context.testExpression("network", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transaction.setNetwork(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("blockHash", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transaction.setBlockHash(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("transactionHash", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transaction.setTransactionHash(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("blockNumber", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transaction.setBlockNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("transactionTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transaction.setTransactionTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("transactionIndex", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transaction.setTransactionIndex(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("numberOfTransactions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transaction.setNumberOfTransactions(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transaction.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("to", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transaction.setTo(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("from", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transaction.setFrom(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("contractAddress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transaction.setContractAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("gasUsed", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transaction.setGasUsed(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("cumulativeGasUsed", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transaction.setCumulativeGasUsed(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("effectiveGasPrice", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transaction.setEffectiveGasPrice(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("signatureV", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transaction.setSignatureV(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("signatureR", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transaction.setSignatureR(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("signatureS", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transaction.setSignatureS(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("transactionFee", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transaction.setTransactionFee(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("transactionId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transaction.setTransactionId(context.getUnmarshaller(String.class).unmarshall(context));
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

        return transaction;
    }

    private static TransactionJsonUnmarshaller instance;

    public static TransactionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TransactionJsonUnmarshaller();
        return instance;
    }
}
