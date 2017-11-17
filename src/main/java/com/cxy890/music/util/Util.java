package com.cxy890.music.util;

import com.cxy890.music.model.CommonResult;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.dongliu.requests.RawResponse;
import net.dongliu.requests.Requests;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Util {

    public static void main(String[] args) throws IOException {
        String url = "https://c.y.qq.com/v8/fcg-bin/v8.fcg";
        Map<String, Object> params = new HashMap<>();
        params.put("channel", "singer");
        params.put("page", "list");
        params.put("key", "cn_man_all");
        params.put("pagesize", 100);
        params.put("pagenum", 1);
        params.put("g_tk","2090557760");
        params.put("jsonpCallback", "GetSingerListCallback");
        params.put("loginUin", 0);
        params.put("hostUin", 0);
        params.put("format", "jsonp");
        params.put("inCharset", "utf8");
        params.put("outCharset", "utf-8");
        params.put("notice", 0);
        params.put("platform", "yqq");
        params.put("needNewCode", 0);
        Map<String, Object> header = new HashMap<>();
        header.put("user-agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.101 Safari/537.36");
        header.put("cookie", "RK=dZVjdA0PET; pgv_pvid=2070299550; ptcz=875266a6271dd2081dc9859727d2a582f06382881f2ed0aa20847ad312445928; pt2gguin=o0779220829; uin=null; skey=null; luin=null; lskey=null; user_id=null; session_id=null; yqq_stat=0; ts_last=y.qq.com/portal/singer_list.html; ts_uid=4544432352");
        RawResponse response = Requests.get(url)
                .headers(header)
                .params(params)
                .cookies()
                .send();
        String result = response.readToText();
        String first = result.replaceFirst("GetSingerListCallback\\(", "").replaceAll("[)]$", "");
        ObjectMapper mapper = new ObjectMapper();
        CommonResult commonResult = mapper.readValue(first, CommonResult.class);
        System.out.println(commonResult.getData());

    }

}
