SUMMARY = "Basic Odroid DFB graphics image"

IMAGE_FEATURES += "splash debug-tweaks tools-debug"

LICENSE = "MIT"

inherit core-image distro_features_check extrausers

# let's make sure we have a good image..
REQUIRED_DISTRO_FEATURES = " directfb alsa libsdl2 libsdl2-image"


IMAGE_INSTALL_append += "${@bb.utils.contains('MACHINE', 'odroid-xu4', ' odroid-edid mali-t62x', '', d)}"


COMPATIBLE_MACHINE = "odroid-xu4|genericx86-64"

