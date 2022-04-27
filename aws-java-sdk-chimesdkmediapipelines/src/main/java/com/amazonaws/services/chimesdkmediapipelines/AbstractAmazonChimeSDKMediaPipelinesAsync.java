/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chimesdkmediapipelines;

import javax.annotation.Generated;

import com.amazonaws.services.chimesdkmediapipelines.model.*;

/**
 * Abstract implementation of {@code AmazonChimeSDKMediaPipelinesAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonChimeSDKMediaPipelinesAsync extends AbstractAmazonChimeSDKMediaPipelines implements AmazonChimeSDKMediaPipelinesAsync {

    protected AbstractAmazonChimeSDKMediaPipelinesAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateMediaCapturePipelineResult> createMediaCapturePipelineAsync(CreateMediaCapturePipelineRequest request) {

        return createMediaCapturePipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMediaCapturePipelineResult> createMediaCapturePipelineAsync(CreateMediaCapturePipelineRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateMediaCapturePipelineRequest, CreateMediaCapturePipelineResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteMediaCapturePipelineResult> deleteMediaCapturePipelineAsync(DeleteMediaCapturePipelineRequest request) {

        return deleteMediaCapturePipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMediaCapturePipelineResult> deleteMediaCapturePipelineAsync(DeleteMediaCapturePipelineRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteMediaCapturePipelineRequest, DeleteMediaCapturePipelineResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetMediaCapturePipelineResult> getMediaCapturePipelineAsync(GetMediaCapturePipelineRequest request) {

        return getMediaCapturePipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMediaCapturePipelineResult> getMediaCapturePipelineAsync(GetMediaCapturePipelineRequest request,
            com.amazonaws.handlers.AsyncHandler<GetMediaCapturePipelineRequest, GetMediaCapturePipelineResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListMediaCapturePipelinesResult> listMediaCapturePipelinesAsync(ListMediaCapturePipelinesRequest request) {

        return listMediaCapturePipelinesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMediaCapturePipelinesResult> listMediaCapturePipelinesAsync(ListMediaCapturePipelinesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListMediaCapturePipelinesRequest, ListMediaCapturePipelinesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
