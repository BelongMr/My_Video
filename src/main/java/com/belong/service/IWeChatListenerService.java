package com.belong.service;

import java.io.IOException;

public interface IWeChatListenerService {
    void onLoadingQRCode();
    byte[] getJpgDate();
    /**
     * 得到登录二维码
     *
     * @param jpgData 二维码图片
     */
    void onReceivedQRCode(byte[] jpgData);

    /**
     * 二维码被扫描
     *
     * @param jpgData 头像
     */
    void onQRCodeScanned(byte[] jpgData);

    void onLoginResult(boolean loginSucceed);

    void onReceivedMoney(String money, String mark, String id) throws IOException;

    /**
     * 登录成功后掉线
     *
     * @param onlineTime 掉线之前保持在线到时长
     */
    void onDropped(long onlineTime);

    void onException(IOException e);
}