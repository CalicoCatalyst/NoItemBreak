/**
 * @(#)YamlConfigFile.java        v0.1.0-SPIGOT-BETA 16/8/21
 * 
 * GNU General Public License v3
 * See The LICENSE.Txt File
 * All Rights Reserved
 * 
 * @author Insxnity
 */

package net.insxnity.api.data.storage.config;

import java.io.File;

import org.bukkit.plugin.Plugin;

import net.insxnity.api.data.storage.YamlDataFile;


public class YamlConfigFile extends YamlDataFile {
    
    public YamlConfigFile(Plugin plugin, String fileName) {
        super(plugin, fileName);
    }
    public YamlConfigFile(Plugin plugin, File file) {
        super(plugin, file);
    }
    
}