package it.eng.bollettino.upgrade;

import com.liferay.portal.kernel.upgrade.UpgradeProcess;

public class UpgradeBollettinoProcessor extends UpgradeProcess {

	private String getTable(String[] tables, String tableName) {

		for (String table : tables) {
			if (table.indexOf(tableName) > 0) {
				return table;
			}
		}

		return null;
	}
	
	@Override
	protected void doUpgrade() throws Exception {
		
	}

}
