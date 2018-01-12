package com.soecode.lyf.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

@Controller
@RequestMapping("/message")
public class SocketService {
    //搭建服务器端
    @RequestMapping("/send")
    @ResponseBody
    public  String  msg() {
      return "socket没做";
    }
}