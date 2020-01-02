DESCRIPTION = "SDL Tutorial" 
SECTION = "examples" 
LICENSE = "MIT" 
LIC_FILES_CHKSUM = "file://COPYRIGHT.txt;md5=409eb13b66f123be3c9ca55334bdf9bb"


DEPENDS = " alsa libsdl2 libsdl2-image"
BRANCH = "master"
SRCREV = "f175f0ef96fbd5016b8a2bb68f92e929a22e938a"
SRC_URI = "git://git@bitbucket.org/guster32/sdltutorial.git;protocol=ssh;branch=master"

S = "${WORKDIR}/git"

inherit pkgconfig cmake

EXTRA_OECMAKE += "-DCMAKE_BUILD_TYPE=debug -DCMAKE_INSTALL_PREFIX=/usr"
