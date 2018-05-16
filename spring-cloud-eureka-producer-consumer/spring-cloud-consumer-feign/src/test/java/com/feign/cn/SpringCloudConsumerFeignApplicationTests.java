package com.feign.cn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.FileCopyUtils;

import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringCloudConsumerFeignApplicationTests {

	@Test
	public void contextLoads() {
	}

	/** 文件上传测试 */
	@Test
	public void uploadTest() throws Exception {
		File f = new File("D:/touxiang.jpg");
		FileCopyUtils.copy(f, new File("D:/img/2.jpg"));
	}

}
