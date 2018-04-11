package com.test;

import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedBloceDemo {

    private String[] tradeList;

    private TreeSet<String> tradeSet = new TreeSet<>();

    private DateFormat df=new SimpleDateFormat("yyyyMMdd");

    // TODO 可自行定义需要的变量

    /**
     * 工具初始化，初始化的目的是让工具具备更加合适各的数据结构，方便计算提高效率
     *
     * @param tradeDayList 包含一年内所有的交易日期，格式如：20160701 20160704 20160705，非交易日20160702 20160703不在其中.此数据属于外部程序提供，作为本程序的输入
     */
    public void init(List<String> tradeDayList) {
        tradeList = new String[tradeDayList.size()];
        for (int i=0 ;i<tradeDayList.size();i++) {
            tradeList[i] = tradeDayList.get(i);
        }
        Arrays.sort(tradeList);
        tradeSet.addAll(tradeDayList);
    }

    /**
     * 给定任意时间，返回给定时间的T+n交易日
     *
     * @param time       给定要计算的时间。
     * @param offsetDays 交易日偏移量，offsetDays可以为负数，表示T-n的计算。
     */
    public String getTradeDay(Date time, int offsetDays) {
        String timeStr = null;
        int index=-1;
        if ( time.getHours() < 15) {
            // 当天
            timeStr = df.format(time);
        }else{
            timeStr = df.format(new Date(time.getYear(), time.getMonth(), time.getDate() + 1));
        }
        try {
            String trade = tradeSet.ceiling(timeStr);
            index=Arrays.binarySearch(tradeList, trade);
            int newIndex = index + offsetDays;
            if (newIndex > -1 && newIndex < tradeList.length) {
                return tradeList[newIndex];
            } else {
                System.out.println("no such trade dat");
                return null;
            }
        } catch (NullPointerException e) {
            System.out.println("no such trade dat");
            return null;
        }
    }

    public static void main(String[] args) {
    }
}

