SUMMARY = "Basic Wayland graphics image"
DISTRO_FEATURES_remove = " x11"
IMAGE_FEATURES += "splash debug-tweaks tools-debug package-management ssh-server-dropbear hwcodecs"
DISTRO_FEATURES_append = " wayland alsa alsa-lib pulseaudio libsdl2 libsdl2-image"

LICENSE = "MIT"

inherit core-image distro_features_check extrausers

# Networking
#CORE_IMAGE_EXTRA_INSTALL += " packagegroup-base-wifi dhcp-server dhcp-client"
#IMAGE_INSTALL_append += " kernel-module-rt2800usb kernel-module-rt2800lib"
#IMAGE_INSTALL_append += " linux-firmware"

# Graphics and Audio
#REQUIRED_DISTRO_FEATURES = " wayland alsa alsa-lib pulseaudio libsdl2 libsdl2-image"
DISTRO_FEATURES_append = " wayland opengl weston alsa alsa-lib pulseaudio libsdl2 libsdl2-image"
CORE_IMAGE_BASE_INSTALL += "weston weston-init weston-examples gtk+3-demo clutter-1.0-examples"
IMAGE_INSTALL_append += " ${@bb.utils.contains('MACHINE', 'odroid-xu4', ' odroid-edid', '', d)}"

#THERMAL
CORE_IMAGE_BASE_INSTALL += "lmsensors"

#Bechmark tools
CORE_IMAGE_EXTRA_INSTALL += " glmark2"

# DEV Tools
CORE_IMAGE_EXTRA_INSTALL += " vim"

#SDL Test Samples
IMAGE_INSTALL_append += " sdltutorials"

## SDK stuff, to build extensible sdk use bitbake -c populate_sdk_ext
SDKIMAGE_FEATURES += "staticdev-pkgs"
SDKIMAGE_FEATURES += "dev-pkgs"

COMPATIBLE_MACHINE = "odroid-xu4|qemuarm|qemux86-64|rockpi-4-rk3399i|jetson-nano-qspi-sd"

