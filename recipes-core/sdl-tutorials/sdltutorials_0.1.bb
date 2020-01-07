DESCRIPTION = "SDL Tutorial" 
SECTION = "examples" 
LICENSE = "MIT" 
LIC_FILES_CHKSUM = "file://COPYRIGHT.txt;md5=409eb13b66f123be3c9ca55334bdf9bb"


DEPENDS_append = " libsdl2 libsdl2-image"
BRANCH = "master"
SRCREV = "16f7817453c4979886ec14047407086a2bcd2997"
SRC_URI = "git://git@bitbucket.org/guster32/sdltutorial.git;protocol=ssh;branch=master"

S = "${WORKDIR}/git"

inherit pkgconfig cmake

EXTRA_OECMAKE += " -DCMAKE_BUILD_TYPE=debug -DCMAKE_INSTALL_PREFIX=/usr"
