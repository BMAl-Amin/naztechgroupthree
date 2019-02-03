package io.naztech.g3project.interfacdao;

import io.naztech.g3project.model.Branch;

public interface IBranchDao extends IGetAll<Branch>{
	public Branch findBrachByName(String branchName);

}
