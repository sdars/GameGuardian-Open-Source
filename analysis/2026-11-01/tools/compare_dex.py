import zipfile, hashlib, subprocess, sys
apk=sys.argv[1]
z=zipfile.ZipFile(apk)
d=z.read('classes.dex')
print('len',len(d),'sha256',hashlib.sha256(d).hexdigest())
orig=open('tmp/analysis/2026-11-01/classes.dex','rb').read()
print('orig len',len(orig),'sha256',hashlib.sha256(orig).hexdigest())
print('equal',d==orig)
