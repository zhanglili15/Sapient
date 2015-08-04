package com.github.autotest.sapient.ift.tookit.util;

import java.util.Map;
import java.util.TreeMap;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.lang.StringEscapeUtils;
import org.testng.annotations.Test;

import com.github.autotest.sapient.toolkit.util.CommUtils;
import com.github.autotest.sapient.toolkit.util.JsonUtil;

public class TestJsonUtil {
	private Map<String, Object> oneResult = new TreeMap<String, Object>();
	
	@Test
	public void getAllResultTest(){
		String jsonUrlen = "%7B%22data%22%3A%7B%22rank_strategy_version%22%3A%227.0.0%22%2C%22remind_infos%22%3A%5B%5D%2C%22page_size%22%3A20%2C%22rank_strategy_tag%22%3A%227%22%2C%22page_index%22%3A0%2C%22poi_total_num%22%3A3%2C%22poilist%22%3A%5B%7B%22id%22%3A213082%2C%22name%22%3A%22%E7%8C%AB%E7%9C%BC%E6%8A%AB%E8%90%A8%E5%A4%96%E5%8D%96%22%2C%22support_coupon%22%3A0%2C%22is_favorite%22%3A0%2C%22sort_reason_type%22%3A0%2C%22sort_reason_tag%22%3A%22%22%2C%22status%22%3A1%2C%22status_desc%22%3A%22%22%2C%22pic_url%22%3A%22http%3A%2F%2Fp0.meituan.net%2Fxianfu%2F__43597244__3602250.jpg%22%2C%22avg_delivery_time%22%3A31%2C%22shipping_fee%22%3A4.0%2C%22shipping_fee_discount%22%3A0%2C%22min_price%22%3A20.0%2C%22new_promotion%22%3A0%2C%22discounts2%22%3A%5B%7B%22type%22%3A14%2C%22info%22%3A%22%E6%96%B0%E7%94%A8%E6%88%B7%E4%B8%8B%E5%8D%95%EF%BC%8C%E8%BF%944%E5%BC%A02%E5%85%83%E7%BA%A2%E5%8C%85%22%2C%22icon_url%22%3A%22http%3A%2F%2Fp1.meituan.net%2Fxianfu%2Fcc6454b1054d2300b227bcbdb74a7ffb811.png%22%2C%22use_icon_from_server%22%3A1%2C%22display_code%22%3A2%2C%22sequence%22%3A2%7D%2C%7B%22type%22%3A6%2C%22info%22%3A%22%E6%BB%A120%E5%87%8F5%3B%E6%BB%A150%E5%87%8F12%EF%BC%88%E5%9C%A8%E7%BA%BF%E6%94%AF%E4%BB%98%E4%B8%93%E4%BA%AB%EF%BC%89%22%2C%22icon_url%22%3A%22http%3A%2F%2Fp1.meituan.net%2Fxianfu%2F5f2ef69d46a9077a57869749d31bb19a843.png%22%2C%22use_icon_from_server%22%3A1%2C%22display_code%22%3A2%2C%22sequence%22%3A3%7D%2C%7B%22type%22%3A10%2C%22info%22%3A%22%E8%AF%A5%E5%95%86%E5%AE%B6%E6%94%AF%E6%8C%81%E5%9C%A8%E7%BA%BF%E6%94%AF%E4%BB%98%22%2C%22icon_url%22%3A%22http%3A%2F%2Fp1.meituan.net%2Fxianfu%2F86783917d7b53148b6e57ac6689c5b9e786.png%22%2C%22use_icon_from_server%22%3A1%2C%22display_code%22%3A1%2C%22sequence%22%3A50%7D%5D%2C%22shipping_time_info%22%3A%7B%22in_shipping_time%22%3A1%2C%22beg_shipping_time%22%3A%22%22%2C%22status_content%22%3A%22%22%2C%22desc_content%22%3A%22%22%7D%2C%22month_sale_num%22%3A149%2C%22wm_poi_score%22%3A4.3%2C%22shipping_time_x%22%3A%22%5B%5B%5C%2210%3A00-15%3A00%5C%22%2C%5C%2216%3A00-20%3A30%5C%22%5D%2C%5B%5C%2210%3A00-15%3A00%5C%22%2C%5C%2216%3A00-20%3A30%5C%22%5D%2C%5B%5C%2210%3A00-15%3A00%5C%22%2C%5C%2216%3A00-20%3A30%5C%22%5D%2C%5B%5C%2210%3A00-15%3A00%5C%22%2C%5C%2216%3A00-20%3A30%5C%22%5D%2C%5B%5C%2210%3A00-15%3A00%5C%22%2C%5C%2216%3A00-20%3A30%5C%22%5D%2C%5B%5C%2210%3A00-15%3A00%5C%22%2C%5C%2216%3A00-20%3A30%5C%22%5D%2C%5B%5C%2210%3A00-15%3A00%5C%22%2C%5C%2216%3A00-20%3A30%5C%22%5D%5D%22%2C%22pre_book%22%3A0%2C%22brand_type%22%3A9400%2C%22sales%22%3A0%2C%22priority%22%3A0%2C%22buz_type%22%3A0%7D%2C%7B%22id%22%3A171089%2C%22name%22%3A%22%E6%AF%94%E6%A0%BC%E8%87%AA%E5%8A%A9%E6%AF%94%E8%90%A8%EF%BC%88%E7%87%95%E9%83%8A%E9%A4%90%E5%8E%85%EF%BC%89%22%2C%22support_coupon%22%3A0%2C%22is_favorite%22%3A0%2C%22sort_reason_type%22%3A0%2C%22sort_reason_tag%22%3A%22%22%2C%22status%22%3A1%2C%22status_desc%22%3A%22%22%2C%22pic_url%22%3A%22http%3A%2F%2Fp1.meituan.net%2Fxianfu%2Fce258f45de7ec32b0085709274336df427774.jpg%22%2C%22avg_delivery_time%22%3A36%2C%22shipping_fee%22%3A7.0%2C%22shipping_fee_discount%22%3A0%2C%22min_price%22%3A0.0%2C%22new_promotion%22%3A0%2C%22discounts2%22%3A%5B%7B%22type%22%3A6%2C%22info%22%3A%22%E6%BB%A150%E5%87%8F10%3B%E6%BB%A1100%E5%87%8F20%EF%BC%88%E5%9C%A8%E7%BA%BF%E6%94%AF%E4%BB%98%E4%B8%93%E4%BA%AB%EF%BC%89%22%2C%22icon_url%22%3A%22http%3A%2F%2Fp1.meituan.net%2Fxianfu%2F5f2ef69d46a9077a57869749d31bb19a843.png%22%2C%22use_icon_from_server%22%3A1%2C%22display_code%22%3A2%2C%22sequence%22%3A3%7D%2C%7B%22type%22%3A10%2C%22info%22%3A%22%E8%AF%A5%E5%95%86%E5%AE%B6%E6%94%AF%E6%8C%81%E5%9C%A8%E7%BA%BF%E6%94%AF%E4%BB%98%22%2C%22icon_url%22%3A%22http%3A%2F%2Fp1.meituan.net%2Fxianfu%2F86783917d7b53148b6e57ac6689c5b9e786.png%22%2C%22use_icon_from_server%22%3A1%2C%22display_code%22%3A1%2C%22sequence%22%3A50%7D%2C%7B%22type%22%3A11%2C%22info%22%3A%22%E6%94%AF%E6%8C%81%E5%BC%80%E5%8F%91%E7%A5%A8%EF%BC%8C%E5%BC%80%E7%A5%A8%E9%87%91%E9%A2%9D0%E5%85%83%E8%B5%B7%E3%80%82%E8%AF%B7%E5%9C%A8%E4%B8%8B%E5%8D%95%E6%97%B6%E5%A1%AB%E5%A5%BD%E5%BC%80%E7%A5%A8%E6%8A%AC%E5%A4%B4%E3%80%82%22%2C%22icon_url%22%3A%22http%3A%2F%2Fp0.meituan.net%2Fxianfu%2Ff8aafc0b37f8ab7b29b17dca5335bb98824.png%22%2C%22use_icon_from_server%22%3A1%2C%22display_code%22%3A1%2C%22sequence%22%3A51%7D%5D%2C%22shipping_time_info%22%3A%7B%22in_shipping_time%22%3A0%2C%22beg_shipping_time%22%3A%2211%3A00%22%2C%22status_content%22%3A%22%E6%8E%A5%E5%8F%97%E9%A2%84%E8%AE%A2%E4%B8%AD%22%2C%22desc_content%22%3A%2211%3A00%E5%90%8E%E5%BC%80%E5%A7%8B%E9%85%8D%E9%80%81%22%7D%2C%22month_sale_num%22%3A98%2C%22wm_poi_score%22%3A4.4%2C%22shipping_time_x%22%3A%22%5B%5B%5C%2211%3A00-20%3A30%5C%22%5D%2C%5B%5C%2211%3A00-20%3A30%5C%22%5D%2C%5B%5C%2211%3A00-20%3A30%5C%22%5D%2C%5B%5C%2211%3A00-20%3A30%5C%22%5D%2C%5B%5C%2211%3A00-20%3A30%5C%22%5D%2C%5B%5C%2211%3A00-20%3A30%5C%22%5D%2C%5B%5C%2211%3A00-20%3A30%5C%22%5D%5D%22%2C%22pre_book%22%3A1%2C%22brand_type%22%3A263%2C%22sales%22%3A0%2C%22priority%22%3A0%2C%22buz_type%22%3A0%7D%2C%7B%22id%22%3A302388%2C%22name%22%3A%22%E5%8D%8E%E8%8E%B1%E5%A3%AB(%E7%87%95%E9%83%8A)%22%2C%22support_coupon%22%3A0%2C%22is_favorite%22%3A0%2C%22sort_reason_type%22%3A0%2C%22sort_reason_tag%22%3A%22%22%2C%22status%22%3A3%2C%22status_desc%22%3A%22%E4%BC%91%E6%81%AF%E4%B8%AD%22%2C%22pic_url%22%3A%22http%3A%2F%2Fp0.meituan.net%2Fxianfu%2F609988035c023e6e83750669d02ed8eb20018.jpg%22%2C%22avg_delivery_time%22%3A0%2C%22shipping_fee%22%3A0.0%2C%22shipping_fee_discount%22%3A0%2C%22min_price%22%3A25.0%2C%22new_promotion%22%3A1%2C%22discounts2%22%3A%5B%5D%2C%22shipping_time_info%22%3A%7B%22in_shipping_time%22%3A1%2C%22beg_shipping_time%22%3A%22%22%2C%22status_content%22%3A%22%22%2C%22desc_content%22%3A%22%22%7D%2C%22month_sale_num%22%3A0%2C%22wm_poi_score%22%3A0.0%2C%22shipping_time_x%22%3A%22%5B%5B%5C%2210%3A00-20%3A30%5C%22%5D%2C%5B%5C%2210%3A00-20%3A30%5C%22%5D%2C%5B%5C%2210%3A00-20%3A30%5C%22%5D%2C%5B%5C%2210%3A00-20%3A30%5C%22%5D%2C%5B%5C%2210%3A00-20%3A30%5C%22%5D%2C%5B%5C%2210%3A00-20%3A30%5C%22%5D%2C%5B%5C%2210%3A00-20%3A30%5C%22%5D%5D%22%2C%22pre_book%22%3A0%2C%22brand_type%22%3A440%2C%22sales%22%3A0%2C%22priority%22%3A0%2C%22buz_type%22%3A0%7D%5D%7D%2C%22code%22%3A0%2C%22msg%22%3A%22%E6%88%90%E5%8A%9F%22%7D";
		Map<String, Object> jsonResult = JsonUtil.getAllResult(CommUtils.urlDecode(jsonUrlen, "UTF-8"));
//		System.out.println("--"+jsonResult.get("avg_delivery_time").toString());
		String avg_delivery_time = jsonResult.get("avg_delivery_time").toString();
		org.testng.Assert.assertTrue(avg_delivery_time.equals("[31, 36, 0]"), "多层解析成功");
	}

}
