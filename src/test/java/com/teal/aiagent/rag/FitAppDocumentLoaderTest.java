package com.teal.aiagent.rag;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FitAppDocumentLoaderTest {

    @Resource
    private FitAppDocumentLoader fitAppDocumentLoader;

    @Test
    void loadMarkdowns() {
        fitAppDocumentLoader.loadMarkdowns();
    }
}
