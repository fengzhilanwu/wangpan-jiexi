package cn.qaiu.parser;//package cn.qaiu.lz.common.parser;

import io.vertx.core.Future;

public interface IPanTool {
    Future<String> parse();

    default String parseSync() {
        return parse().toCompletionStage().toCompletableFuture().join();
    }
}
