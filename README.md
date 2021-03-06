# ymstest
## Download ONOS and build
```
cd ~/
wget https://github.com/opennetworkinglab/onos/archive/master.zip
unzip master.zip
mv onos-master onos

cd ~/onos
. tools/dev/bash_profile

cd ~/onos/tools/dev/bin/
./onos-setup-ubuntu-devenv
./onos-setup-karaf

cd ~/onos
mcis
```
## Start ONOS and check any exceptions
```
ok clean debug
onos> exception-display
```
## Add latest onos yang tools
```
cd ~/onos/utils
git clone https://github.com/opennetworkinglab/onos-yang-tools.git
[or latest from https://gerrit.onosproject.org/#/c/11185/2]
[add module onos-yang-tools in ~/onos/utils/pom.xml]
mcis
```
## Add latest yms code
```
cd ~/onos/apps
git clone https://github.com/GauravAgrawal-Huawei/ymsm
mv ymsm yms
mcis
```
## Add latest restconf code
```
[download latest restconf code from gerrit or download from private git given below]
cd ~/onos/apps
git clone https://github.com/SojanKoshy/restconf.git
[or latest from https://github.com/chengfannature/restconf]
[add module restconf in ~/onos/apps/pom.xml]
mcis
```
## Add latest yms-test code
```
cd ~/onos/apps/test
git clone https://github.com/SojanKoshy/ymstest.git
[add module ymstest in ~/onos/apps/test/pom.xml]
mcis
```
## Start ONOS and test YMS
```
cd ~/onos
. tools/dev/bash_profile
mcis
ok clean debug 
onos> 
onos> app activate org.onosproject.yms
onos> app activate org.onosproject.ymstest
onos> app activate org.onosproject.restconf
onos>        
onos> yms-test testNbiResister
[REPORT] Running test 1
Registered Service
[REPORT] testNbiResister Passed

[SUMMARY REPORT] Total: 1, Passed:1, Failed:0, Pass percent: 100%
onos> 
```
## From postman tool POST 
```
http://127.0.0.1:8181/onos/restconf/data/network

{
    "networklist": [{
        "network-id": "123",
        "server-provided": "false"
    }],
    "network-path": {
        "source": "10.1.1.1"
    }
}
```
