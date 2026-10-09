# AI 超级智能体项目

> 作者：程序猿Teal
>
> 本项目为个人项目，请勿转载

## 项目介绍

基于 Spring AI 的超级智能体应用，包含：

- **AI运动健康助手（FitApp）**：运动科学与健康管理顾问，支持多轮对话、RAG 知识库、工具调用与 MCP
- **AI超级智能体（TealManus）**：通用工具调用型智能体

## 模块结构

| 模块 | 说明 |
|---|---|
| 根工程 `ai-agent-one` | 后端主服务（`com.teal.aiagent`） |
| `teal-ai-agent-frontend` | Vue3 前端 |
| `teal-image-search-mcp-server` | 图片搜索 MCP 服务（`com.teal.imagesearchmcpserver`） |

## 快速开始

### 后端

```bash
mvn spring-boot:run
```

默认端口：`8123`，上下文路径以 `application.yml` 为准。

主要接口：

- `/api/ai/fit_app/chat/sse` — AI运动健康助手（SSE）
- `/api/ai/manus/chat` — AI超级智能体（SSE）

### 前端

```bash
cd teal-ai-agent-frontend
npm install
npm run dev
```

### MCP 图片搜索服务

```bash
cd teal-image-search-mcp-server
mvn spring-boot:run
```

## 知识库

RAG 文档位于 `src/main/resources/document/`：

- 运动与健康常见问题 - 新手起步篇
- 运动与健康常见问题 - 进阶突破篇
- 运动与健康常见问题 - 伤痛康复篇

## 仓库

https://github.com/Teal-loading/ai-agent-one
