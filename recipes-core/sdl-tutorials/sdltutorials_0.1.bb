DESCRIPTION = "SDL Tutorial" 
SECTION = "examples" 
LICENSE = "CLOSED" 
PR = "r0" 

#Replace this dependency with SDL2
DEPENDS = "opencv"

SRC_URI = "git://git@bitbucket.org/guster32/sdltutorial.git;protocol=ssh"

S = "${WORKDIR}/git"

inherit pkgconfig cmake

# do_install() {
#     install -d ${D}${bindir}
#     install -m 0755 cameracapture ${D}${bindir}
# }