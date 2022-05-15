SUMMARY = "GLPlay"
SECTION = "Sample"
LICENSE = "MIT"
HOMEPAGE = "https://github.com/guster32/glplay"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84f20c3b625ccbba2d4fb9c7ba68e9f1"
DEPENDS += "mesa egl libgles2 libdrm virtual/libgbm"

SRC_URI += "git://git@github.com/guster32/glplay.git;protocol=ssh;nobranch=1;branch=main"
SRCREV = "2b2ba4a68479b3fb280bc7a48c44362a164f863a"
S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE = ""