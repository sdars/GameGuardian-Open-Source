import re, sys, collections
p=sys.argv[1]
lines=open(p,encoding='utf-8',errors='replace').read().splitlines()
errs=[]
for i,l in enumerate(lines):
    m=re.match(r'(.+?\.java):(\d+): error: (.*)',l)
    if m: errs.append((m.group(1),int(m.group(2)),m.group(3),'\n'.join(lines[i+1:i+6])))
print('total',len(errs))
needle=sys.argv[2] if len(sys.argv)>2 else None
if needle:
    for f,ln,msg,ctx in errs:
        if needle in msg:
            print(f'{f}:{ln}')
            print(ctx)
else:
    for f,c in collections.Counter(e[0] for e in errs).most_common(40): print(c,f)
