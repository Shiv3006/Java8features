package com.bnt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.json.JSONException;

import com.bnt.dao.AtlasSignupDao;

public class AtlasSignupService {

	public static void main(String[] args) throws JSONException {
		// AtlasSignUp as=new AtlasSignUp(AtlasSignupDao.getSignUpREquest());
		List<String> getList = AtlasSignupDao.getSignUpREquest();
		findPricePlans("gh", "pfx");
		/*
		 * String s = getList.get(0); System.out.println(s); JSONObject json =
		 * new JSONObject(s); System.out.println(json.toString()); String
		 * orgcode = json.getString("device_info"); System.out.println(orgcode);
		 */
		/*
		 * for (String s : getList) { System.out.println(s); }
		 */
	}

	public static List<String> findPricePlans(String isActive, String customerType) {
		// AtlasSignupDao ret=new AtlasSignupDao();
		List<String> pricingPlansList=null;
		try {
			 pricingPlansList = AtlasSignupDao.getSignUpREquest();
			if (pricingPlansList.isEmpty()) {
				throw new Exception("something went wrong - empty data found");
			}
			//pricingPlansList = pricingPlansList.stream().filter(s -> true).collect(Collectors.toList());
			if (!isActive.isEmpty()) {
				Boolean active = Boolean.valueOf(isActive);
				System.out.println(active);
				pricingPlansList = pricingPlansList.stream().filter(s -> active.equals(isActive))
						.collect(Collectors.toList());
				System.out.println(pricingPlansList);
				
			}
			if (!customerType.isEmpty()) {
				pricingPlansList = pricingPlansList.stream().filter(s -> {
					return (s.equals(customerType));
				
				}).collect(Collectors.toList());
				System.out.println(pricingPlansList);
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
		System.out.println(pricingPlansList);
		return pricingPlansList;
		

	}

}
