when printing byte array originated from string, we get strange string like '\xvcb\xcvxcbx\xfdgdfgd'
let's convert it to string back

``java -jar string-byte-array-1.0-SNAPSHOT.jar  "'\x9A\x8F\xD0\xD7l\xF8\xF8-\x17\x11\xF5\xC1\xE4\xD5\xBE\xC4\xA0\x00,Y\xAE_\xC9" "+\xAC\x96\x1D\xD7\x05\x17NO\xB14\x85\x8F\x90\xE0\xB1 `\x00?Z\xFD\x1F\xFB"``