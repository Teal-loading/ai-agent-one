package com.teal.aiagent.tools;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PDFGenerationToolTest {

    @Test
    void generatePDF() {
        PDFGenerationTool tool = new PDFGenerationTool();
        String fileName = "Teal AI Agent原创项目.pdf";
        String content = "Teal AI Agent原创项目 https://github.com/Teal-loading/ai-agent-one";
        String result = tool.generatePDF(fileName, content);
        assertNotNull(result);
    }
}