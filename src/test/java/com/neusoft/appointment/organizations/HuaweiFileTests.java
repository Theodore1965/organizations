package com.neusoft.appointment.organizations;

import com.obs.services.ObsClient;
import com.obs.services.model.PutObjectRequest;
import com.obs.services.model.PutObjectResult;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.klock.handler.KlockTimeoutException;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = KlockTestApplication.class)
public class HuaweiFileTests {

	@Test
	public void upload() throws Exception {

	}

	@Test
	public void download() throws Exception {
//		String endPoint = "obs.cn-east-2.myhuaweicloud.com";
//		String ak = "82TBPPE4539IVBVNXAYP";
//		String sk = "0D5iT7iD7WRIhAtOVWluqFjw2aNBTniWYvrWcZge";
//		// 创建ObsClient实例
//		ObsClient obsClient = new ObsClient(ak, sk, endPoint);
//
//		// 待上传的本地文件路径，需要指定到具体的文件名
//		FileInputStream fis = new FileInputStream(new File("E:/test.jpg"));
//		PutObjectResult result = obsClient.putObject("theodore1965", "test.jpg", fis);
//		System.out.println(result);

	}
}
