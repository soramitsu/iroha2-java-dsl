package jp.soramitsu.iroha2.model;

import java.util.*;
/**
 * 
 * @author mtakemiya
 *
 */
public class Accounts {
	private List<Account> accounts;

	/**
	 * @return the accounts
	 */
	public List<Account> getAccounts() {
		return accounts;
	}

	/**
	 * @param accounts the accounts to set
	 */
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
}
