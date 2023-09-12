package papercheck;

import junit.framework.TestCase;
import papercheck.Main;
import org.junit.Assert;
import org.junit.Test;


public class TestMain {
    /**
     * 测试源文件路径为null的情况
     */
    @Test
    public void testForOriginalArticleNull(){
//        Assert.assertThrows()
        Main.main(new String[]{null,"D:\\gitcode\\acofGDUT\\3121004921\\homework\\Test\\resources\\orig_0.8_add.txt","D:\\1.txt"});
    }


    /**
     * 测试对比文件路径为null的情况
     */
    @Test
    public void testForPlagiarismArticleNull(){
        Main.main(new String[]{"D:\\gitcode\\acofGDUT\\3121004921\\homework\\Test\\resources\\orig.txt",null,"D:\\1.txt"});
    }

    /**
     * 测试结果输出文件路径为null的情况
     */
    @Test
    public void testForResultNull(){
        Main.main(new String[]{"D:\\gitcode\\acofGDUT\\3121004921\\homework\\Test\\resources\\orig.txt","D:\\gitcode\\acofGDUT\\3121004921\\homework\\Test\\resources\\orig_0.8_add.txt",null});
    }


    /**
     * 测试路径不存在的情况
     */
    @Test
    public void testForNotExistFile(){
        Main.main(new String[]{"D:\\gitcode\\acofGDUT\\3121004921\\homework\\Test\\resources\\origno.txt","D:\\gitcode\\acofGDUT\\3121004921\\homework\\Test\\resources\\orig_0.8_add.txt","D:\\1.txt"});
    }


    /**
     * 测试输入对比的文件内容为空的情况
     */
    @Test
    public void testForEmpty(){
        Main.main(new String[]{"D:\\gitcode\\acofGDUT\\3121004921\\homework\\Test\\resources\\orig.txt","D:\\gitcode\\acofGDUT\\3121004921\\homework\\Test\\resources\\orig_empty.txt","D:\\1.txt"});
    }

    /**
     * 测试对比orig_0.8_add.txt
     */
    @Test
    public void testForAdd(){
        Main.main(new String[]{"D:\\gitcode\\acofGDUT\\3121004921\\homework\\Test\\resources\\orig.txt","D:\\gitcode\\acofGDUT\\3121004921\\homework\\Test\\resources\\orig_0.8_add.txt","D:\\1.txt"});
    }


    /**
     * 测试对比orig_0.8_del.txt
     */
    @Test
    public void testForDel(){
        Main.main(new String[]{"D:\\gitcode\\acofGDUT\\3121004921\\homework\\Test\\resources\\orig.txt","D:\\gitcode\\acofGDUT\\3121004921\\homework\\Test\\resources\\orig_0.8_del.txt","D:\\1.txt"});
    }

    /**
     * 测试对比orig_0.8_dis_1.txt.txt
     */
    @Test
    public void testForDis1(){
        Main.main(new String[]{"D:\\gitcode\\acofGDUT\\3121004921\\homework\\Test\\resources\\orig_0.8_dis_1.txt","D:\\gitcode\\acofGDUT\\3121004921\\homework\\Test\\resources\\orig_0.8_dis_1.txt","D:\\1.txt"});
    }


    /**
     * 测试对比orig_0.8_dis_10.txt
     */
    @Test
    public void testForAdd10(){
        Main.main(new String[]{"D:\\gitcode\\acofGDUT\\3121004921\\homework\\Test\\resources\\orig_0.8_dis_1.txt","D:\\gitcode\\acofGDUT\\3121004921\\homework\\Test\\resources\\orig_0.8_dis_10.txt","D:\\1.txt"});
    }


    /**
     * 测试对比orig_0.8_dis_15.txt
     */
    @Test
    public void testForDis15(){
        Main.main(new String[]{"D:\\gitcode\\acofGDUT\\3121004921\\homework\\Test\\resources\\orig_0.8_dis_1.txt","D:\\gitcode\\acofGDUT\\3121004921\\homework\\Test\\resources\\orig_0.8_dis_15.txt","D:\\1.txt"});
    }
}
