package com.ebs.main.serviceI;

import org.springframework.web.multipart.MultipartFile;

import com.ebs.main.model.AccountHolderDetails;

public interface AccHolDetailsServiceI
{

public	AccountHolderDetails oncreatedAccountDetails(AccountHolderDetails accdetails);

public AccountHolderDetails saveAccount(String textData, MultipartFile fileAdharcard, MultipartFile filePancard,
		MultipartFile filePhoto, MultipartFile fileJoinLetter, MultipartFile fileSalarySlip);


}
