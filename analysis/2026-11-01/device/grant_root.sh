#!/system/bin/sh
set -e
CFG=/data/adb/ap/package_config
BAK=/data/adb/ap/package_config.bak-20261101
[ -f "$BAK" ] || cp -a "$CFG" "$BAK"
grep -v '^catch_\.me_\.if_\.you_\.can_' "$BAK" > "$CFG.tmp"
echo 'catch_.me_.if_.you_.can_,0,1,10132,0,u:r:magisk:s0' >> "$CFG.tmp"
mv "$CFG.tmp" "$CFG"
chmod 600 "$CFG"
chown root:root "$CFG"
cat "$CFG"
