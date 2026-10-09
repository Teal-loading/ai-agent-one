package com.teal.aiagent.app;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
class FitAppTest {

    @Resource
    private FitApp fitApp;

    @Test
    void testChat() {
        String chatId = UUID.randomUUID().toString();
        // 第一轮
        String message = "你好，我是程序猿Teal";
        String answer = fitApp.doChat(message, chatId);
        // 第二轮
        message = "我想科学减脂，但总是饿得厉害";
        answer = fitApp.doChat(message, chatId);
        Assertions.assertNotNull(answer);
        // 第三轮
        message = "我的核心诉求是什么来着？刚跟你说过，帮我回忆一下";
        answer = fitApp.doChat(message, chatId);
        Assertions.assertNotNull(answer);
    }

    @Test
    void doChatWithReport() {
        String chatId = UUID.randomUUID().toString();
        String message = "你好，我是程序猿Teal，我想减脂但不知道怎么安排训练和饮食";
        FitApp.FitReport fitReport = fitApp.doChatWithReport(message, chatId);
        Assertions.assertNotNull(fitReport);
    }

    @Test
    void doChatWithRag() {
        String chatId = UUID.randomUUID().toString();
        String message = "我是运动新手，刚开始练力量总是找不到发力感，怎么办？";
        String answer = fitApp.doChatWithRag(message, chatId);
        Assertions.assertNotNull(answer);
    }

    @Test
    void doChatWithTools() {
        // 测试联网搜索问题的答案
        testMessage("周末想去户外跑步，推荐几个适合新手慢跑的路线或场地建议？");

        // 测试网页抓取：运动健康案例分析
        testMessage("最近深蹲膝盖不适，看看 https://github.com/Teal-loading/ai-agent-one 上关于伤痛康复的建议怎么写的？");

        // 测试资源下载：图片下载
        testMessage("直接下载一张适合做手机壁纸的运动健身图片为文件");

        // 测试终端操作：执行代码
        testMessage("执行 Python3 脚本来生成数据分析报告");

        // 测试文件操作：保存用户档案
        testMessage("保存我的运动健康档案为文件");

        // 测试 PDF 生成
        testMessage("生成一份‘四周新手减脂计划’PDF，包含训练安排、饮食要点和恢复建议");
    }

    private void testMessage(String message) {
        String chatId = UUID.randomUUID().toString();
        String answer = fitApp.doChatWithTools(message, chatId);
        Assertions.assertNotNull(answer);
    }

    @Test
    void doChatWithMcp() {
        String chatId = UUID.randomUUID().toString();
        // 测试地图 MCP
//        String message = "我想在上海静安区附近找适合户外慢跑的公园，请帮我找到 5 公里内合适的地点";
//        String answer =  fitApp.doChatWithMcp(message, chatId);
//        Assertions.assertNotNull(answer);
        // 测试图片搜索 MCP
        String message = "帮我搜索一些健身动作示范图片";
        String answer =  fitApp.doChatWithMcp(message, chatId);
        Assertions.assertNotNull(answer);
    }
}
