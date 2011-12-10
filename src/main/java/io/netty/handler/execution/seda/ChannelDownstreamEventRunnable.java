/*
 * Copyright 2011 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.netty.handler.execution.seda;


import io.netty.channel.ChannelEvent;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.execution.ChannelEventRunnable;

/**
 * A {@link Runnable} which sends the specified {@link ChannelEvent} downstream.
 */
public class ChannelDownstreamEventRunnable extends ChannelEventRunnable{

    public ChannelDownstreamEventRunnable(ChannelHandlerContext ctx, ChannelEvent e) {
        super(ctx, e);
    }

    /**
     * Send the {@link ChannelEvent} downstream
     */
    @Override
    public void run() {
        ctx.sendDownstream(e);
    }

}
